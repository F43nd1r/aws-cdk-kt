@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

public
    fun masterUserOptionsProperty(initializer: CfnDomain.MasterUserOptionsProperty.Builder.() -> Unit):
    CfnDomain.MasterUserOptionsProperty =
    CfnDomain.MasterUserOptionsProperty.builder().apply(initializer).build()
