package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public
    fun coldStorageOptionsProperty(initializer: CfnDomain.ColdStorageOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.ColdStorageOptionsProperty =
    CfnDomain.ColdStorageOptionsProperty.builder().apply(initializer).build()
