package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun remoteAccessProperty(initializer: CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit =
    {}): CfnNodegroup.RemoteAccessProperty =
    CfnNodegroup.RemoteAccessProperty.builder().apply(initializer).build()
