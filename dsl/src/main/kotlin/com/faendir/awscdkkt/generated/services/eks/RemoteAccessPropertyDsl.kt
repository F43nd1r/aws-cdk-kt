package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnNodegroup

@Generated
public fun buildRemoteAccessProperty(initializer: @AwsCdkDsl
    CfnNodegroup.RemoteAccessProperty.Builder.() -> Unit = {}): CfnNodegroup.RemoteAccessProperty =
    CfnNodegroup.RemoteAccessProperty.Builder().apply(initializer).build()
