@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore

public
    fun storeOptionsProperty(initializer: CfnAnnotationStore.StoreOptionsProperty.Builder.() -> Unit):
    CfnAnnotationStore.StoreOptionsProperty =
    CfnAnnotationStore.StoreOptionsProperty.builder().apply(initializer).build()
