package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMAllocation
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMAllocation(
  id: String,
  props: CfnIPAMAllocationProps,
  initializer: @AwsCdkDsl CfnIPAMAllocation.() -> Unit = {},
): CfnIPAMAllocation = CfnIPAMAllocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMAllocation(id: String, initializer: @AwsCdkDsl CfnIPAMAllocation.Builder.() -> Unit = {}): CfnIPAMAllocation = CfnIPAMAllocation.Builder.create(this, id).apply(initializer).build()
