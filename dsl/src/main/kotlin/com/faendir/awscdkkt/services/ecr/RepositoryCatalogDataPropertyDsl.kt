package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPublicRepository

@Generated
public
    fun repositoryCatalogDataProperty(initializer: CfnPublicRepository.RepositoryCatalogDataProperty.Builder.() -> Unit
    = {}): CfnPublicRepository.RepositoryCatalogDataProperty =
    CfnPublicRepository.RepositoryCatalogDataProperty.builder().apply(initializer).build()
