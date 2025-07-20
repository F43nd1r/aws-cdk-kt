package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkAclEntry(
  id: String,
  props: CfnNetworkAclEntryProps,
  initializer: @AwsCdkDsl CfnNetworkAclEntry.() -> Unit = {},
): CfnNetworkAclEntry = CfnNetworkAclEntry(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkAclEntry(id: String, initializer: @AwsCdkDsl CfnNetworkAclEntry.Builder.() -> Unit = {}): CfnNetworkAclEntry = CfnNetworkAclEntry.Builder.create(this, id).apply(initializer).build()
