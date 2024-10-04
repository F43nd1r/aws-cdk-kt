package com.faendir.awscdkkt.generated.services.s3express

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3express.CfnDirectoryBucket

@Generated
public fun buildServerSideEncryptionRuleProperty(initializer: @AwsCdkDsl
    CfnDirectoryBucket.ServerSideEncryptionRuleProperty.Builder.() -> Unit = {}):
    CfnDirectoryBucket.ServerSideEncryptionRuleProperty =
    CfnDirectoryBucket.ServerSideEncryptionRuleProperty.Builder().apply(initializer).build()
