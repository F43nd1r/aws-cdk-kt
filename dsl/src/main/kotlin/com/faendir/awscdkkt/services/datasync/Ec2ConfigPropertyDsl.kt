package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationEFS

@Generated
public fun ec2ConfigProperty(initializer: CfnLocationEFS.Ec2ConfigProperty.Builder.() -> Unit = {}):
    CfnLocationEFS.Ec2ConfigProperty =
    CfnLocationEFS.Ec2ConfigProperty.builder().apply(initializer).build()
