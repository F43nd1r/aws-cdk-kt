package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcProps
import software.constructs.Construct

@Generated
public fun Construct.vpc(id: String, props: VpcProps): Vpc = Vpc(this, id, props)

@Generated
public fun Construct.vpc(
  id: String,
  props: VpcProps,
  initializer: @AwsCdkDsl Vpc.() -> Unit,
): Vpc = Vpc(this, id, props).apply(initializer)

@Generated
public fun Construct.vpc(id: String): Vpc = Vpc(this, id)

@Generated
public fun Construct.vpc(id: String, initializer: @AwsCdkDsl Vpc.() -> Unit): Vpc = Vpc(this,
    id).apply(initializer)

@Generated
public fun Construct.buildVpc(id: String, initializer: @AwsCdkDsl Vpc.Builder.() -> Unit): Vpc =
    Vpc.Builder.create(this, id).apply(initializer).build()
