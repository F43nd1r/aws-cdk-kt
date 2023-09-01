package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.CfnPrefixListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrefixList(
  id: String,
  props: CfnPrefixListProps,
  initializer: @AwsCdkDsl CfnPrefixList.() -> Unit = {},
): CfnPrefixList = CfnPrefixList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrefixList(id: String, initializer: @AwsCdkDsl
    CfnPrefixList.Builder.() -> Unit = {}): CfnPrefixList = CfnPrefixList.Builder.create(this,
    id).apply(initializer).build()
