package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAM
import software.amazon.awscdk.services.ec2.CfnIPAMProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAM(id: String, initializer: @AwsCdkDsl CfnIPAM.() -> Unit = {}): CfnIPAM =
    CfnIPAM(this, id).apply(initializer)

@Generated
public fun Construct.cfnIPAM(
  id: String,
  props: CfnIPAMProps,
  initializer: @AwsCdkDsl CfnIPAM.() -> Unit = {},
): CfnIPAM = CfnIPAM(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAM(id: String, initializer: @AwsCdkDsl CfnIPAM.Builder.() -> Unit =
    {}): CfnIPAM = CfnIPAM.Builder.create(this, id).apply(initializer).build()
