package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SecurityGroupImportOptions

@Generated
public fun buildSecurityGroupImportOptions(initializer: @AwsCdkDsl
    SecurityGroupImportOptions.Builder.() -> Unit): SecurityGroupImportOptions =
    SecurityGroupImportOptions.Builder().apply(initializer).build()
