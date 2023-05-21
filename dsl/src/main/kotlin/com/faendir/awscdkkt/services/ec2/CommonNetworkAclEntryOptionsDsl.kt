package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions

@Generated
public fun commonNetworkAclEntryOptions(initializer: CommonNetworkAclEntryOptions.Builder.() -> Unit
    = {}): CommonNetworkAclEntryOptions =
    CommonNetworkAclEntryOptions.builder().apply(initializer).build()
