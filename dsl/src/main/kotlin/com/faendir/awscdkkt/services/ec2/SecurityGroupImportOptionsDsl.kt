package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SecurityGroupImportOptions

@Generated
public fun securityGroupImportOptions(initializer: SecurityGroupImportOptions.Builder.() -> Unit =
    {}): SecurityGroupImportOptions =
    SecurityGroupImportOptions.builder().apply(initializer).build()
