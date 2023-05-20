@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

public
    fun masterUserOptionsProperty(initializer: CfnDomain.MasterUserOptionsProperty.Builder.() -> Unit):
    CfnDomain.MasterUserOptionsProperty =
    CfnDomain.MasterUserOptionsProperty.builder().apply(initializer).build()
