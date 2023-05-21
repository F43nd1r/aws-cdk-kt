package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore

@Generated
public
    fun tsvStoreOptionsProperty(initializer: CfnAnnotationStore.TsvStoreOptionsProperty.Builder.() -> Unit
    = {}): CfnAnnotationStore.TsvStoreOptionsProperty =
    CfnAnnotationStore.TsvStoreOptionsProperty.builder().apply(initializer).build()
