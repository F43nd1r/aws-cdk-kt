package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPoolCidr(
  id: String,
  props: CfnIPAMPoolCidrProps,
  initializer: @AwsCdkDsl CfnIPAMPoolCidr.() -> Unit = {},
): CfnIPAMPoolCidr = CfnIPAMPoolCidr(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMPoolCidr(id: String, initializer: @AwsCdkDsl CfnIPAMPoolCidr.Builder.() -> Unit = {}): CfnIPAMPoolCidr = CfnIPAMPoolCidr.Builder.create(this, id).apply(initializer).build()
