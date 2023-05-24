package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.constructs.Construct

@Generated
public fun Construct.networkAclEntry(id: String, props: NetworkAclEntryProps): NetworkAclEntry =
    NetworkAclEntry(this, id, props)

@Generated
public fun Construct.networkAclEntry(
  id: String,
  props: NetworkAclEntryProps,
  initializer: @AwsCdkDsl NetworkAclEntry.() -> Unit,
): NetworkAclEntry = NetworkAclEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkAclEntry(id: String, initializer: @AwsCdkDsl
    NetworkAclEntry.Builder.() -> Unit): NetworkAclEntry = NetworkAclEntry.Builder.create(this,
    id).apply(initializer).build()
