@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

public fun remoteAccessProperty(initializer: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit):
    CfnNodegroup.RemoteAccessProperty =
    CfnNodegroup.RemoteAccessProperty.builder().apply(initializer).build()
