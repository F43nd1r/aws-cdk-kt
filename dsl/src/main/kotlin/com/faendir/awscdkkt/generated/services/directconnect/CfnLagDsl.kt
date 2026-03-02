package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnLag
import software.amazon.awscdk.services.directconnect.CfnLagProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLag(
  id: String,
  props: CfnLagProps,
  initializer: @AwsCdkDsl CfnLag.() -> Unit = {},
): CfnLag = CfnLag(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLag(id: String, initializer: @AwsCdkDsl CfnLag.Builder.() -> Unit = {}): CfnLag = CfnLag.Builder.create(this, id).apply(initializer).build()
