package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildAccessConfigProperty(initializer: @AwsCdkDsl
    CfnCluster.AccessConfigProperty.Builder.() -> Unit = {}): CfnCluster.AccessConfigProperty =
    CfnCluster.AccessConfigProperty.Builder().apply(initializer).build()
