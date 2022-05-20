package com.example.brandat.ui.fragments.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.brandat.R
import com.example.brandat.databinding.FragmentProductBinding


class ProductFragment : Fragment() {

    private lateinit var productRvAdapter: ProductRvAdapter
    private lateinit var binding: FragmentProductBinding
    private val products: ArrayList<ProductModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        products.add(ProductModel("CLASSIC BACKPACK","379 Eg", R.drawable.sh5))
        products.add(ProductModel(" BACKPACK","3700 Eg", R.drawable.sh3))
        products.add(ProductModel("CLASSIC","3 Eg", R.drawable.sh2))
        products.add(ProductModel("Dress","370 Eg", R.drawable.sh))
        products.add(ProductModel("CLASSIC BACKPACK","379 Eg", R.drawable.dress_kid))

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductBinding.inflate(LayoutInflater.from(context), container, false)
        setUpRecyclerView()
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun setUpRecyclerView() {
        binding.rvProducts.apply {
            val layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
            setLayoutManager(layoutManager)
            productRvAdapter = ProductRvAdapter(products)
            adapter = productRvAdapter

        }
    }

}
