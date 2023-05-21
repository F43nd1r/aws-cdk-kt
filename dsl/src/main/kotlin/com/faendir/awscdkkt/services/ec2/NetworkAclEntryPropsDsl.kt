package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps

@Generated
public fun networkAclEntryProps(initializer: NetworkAclEntryProps.Builder.() -> Unit = {}):
    NetworkAclEntryProps = NetworkAclEntryProps.builder().apply(initializer).build()
