package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildStorageConfigProperty(initializer: @AwsCdkDsl
    CfnCluster.StorageConfigProperty.Builder.() -> Unit = {}): CfnCluster.StorageConfigProperty =
    CfnCluster.StorageConfigProperty.Builder().apply(initializer).build()
