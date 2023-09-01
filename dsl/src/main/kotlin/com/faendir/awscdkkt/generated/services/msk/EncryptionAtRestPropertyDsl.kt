package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun buildEncryptionAtRestProperty(initializer: @AwsCdkDsl
    CfnCluster.EncryptionAtRestProperty.Builder.() -> Unit = {}):
    CfnCluster.EncryptionAtRestProperty =
    CfnCluster.EncryptionAtRestProperty.Builder().apply(initializer).build()
