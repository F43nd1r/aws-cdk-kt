@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

public
    fun coldStorageOptionsProperty(initializer: CfnDomain.ColdStorageOptionsProperty.Builder.() -> Unit):
    CfnDomain.ColdStorageOptionsProperty =
    CfnDomain.ColdStorageOptionsProperty.builder().apply(initializer).build()
