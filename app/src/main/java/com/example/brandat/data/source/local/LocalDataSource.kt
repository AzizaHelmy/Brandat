package com.example.brandat.data.source.local

import com.example.brandat.data.source.local.db.BrandatDao
import com.example.brandat.models.CustomerAddress
import androidx.lifecycle.LiveData
import com.example.brandat.data.source.local.db.BrandatDao
import com.example.brandat.ui.fragments.cart.Cart
import javax.inject.Inject

class LocalDataSource @Inject constructor(
   private var brandatDao: BrandatDao
) :ILocalDataSource {

    override suspend fun insertAddress(customerAddress: CustomerAddress?) {
            customerAddress?.let {
                brandatDao.insertAddress(it)
            }
    }

    override suspend fun getAllAddresses(): List<CustomerAddress> {
        return  brandatDao.getAllAddresses()
    }

    override suspend fun removeAddress(city: String) {
        brandatDao.removeAddress(city)
    }


class LocalDataSource @Inject constructor(private var brandatDao: BrandatDao) : ILocalDataSource {
    override suspend fun addProductToCart(product: Cart) {
        brandatDao.insertCartProduct(product)
    }

    override suspend fun removeProductFromCart(product: Cart) {
        brandatDao.removeProductFromCart(product)
    }

    override suspend fun removeSelectedProductsFromCart(product: ArrayList<Cart>) {
        brandatDao.removeSelectedProductsFromCart(product)
    }

    override suspend fun getAllCartProducts(): List<Cart> {
        return brandatDao.getAllCartProducts()
    }

    override suspend fun updateOrder(product: Cart) {
        brandatDao.updateOrder(product.pQuantity,product.pPrice,product.pId)
    }

}