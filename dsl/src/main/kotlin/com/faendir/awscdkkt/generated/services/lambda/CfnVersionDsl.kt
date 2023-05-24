package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVersion(id: String, props: CfnVersionProps): CfnVersion = CfnVersion(this,
    id, props)

@Generated
public fun Construct.cfnVersion(
  id: String,
  props: CfnVersionProps,
  initializer: @AwsCdkDsl CfnVersion.() -> Unit,
): CfnVersion = CfnVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVersion(id: String, initializer: @AwsCdkDsl
    CfnVersion.Builder.() -> Unit): CfnVersion = CfnVersion.Builder.create(this,
    id).apply(initializer).build()
