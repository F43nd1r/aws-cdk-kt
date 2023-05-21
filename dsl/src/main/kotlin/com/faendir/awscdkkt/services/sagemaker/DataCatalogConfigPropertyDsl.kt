package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@Generated
public
    fun dataCatalogConfigProperty(initializer: CfnFeatureGroup.DataCatalogConfigProperty.Builder.() -> Unit
    = {}): CfnFeatureGroup.DataCatalogConfigProperty =
    CfnFeatureGroup.DataCatalogConfigProperty.builder().apply(initializer).build()
