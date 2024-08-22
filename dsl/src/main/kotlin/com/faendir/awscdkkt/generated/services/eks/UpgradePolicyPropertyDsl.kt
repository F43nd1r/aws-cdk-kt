package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildUpgradePolicyProperty(initializer: @AwsCdkDsl
    CfnCluster.UpgradePolicyProperty.Builder.() -> Unit = {}): CfnCluster.UpgradePolicyProperty =
    CfnCluster.UpgradePolicyProperty.Builder().apply(initializer).build()
