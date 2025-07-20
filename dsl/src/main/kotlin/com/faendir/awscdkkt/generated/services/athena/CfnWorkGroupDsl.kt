package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkGroup(
  id: String,
  props: CfnWorkGroupProps,
  initializer: @AwsCdkDsl CfnWorkGroup.() -> Unit = {},
): CfnWorkGroup = CfnWorkGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkGroup(id: String, initializer: @AwsCdkDsl CfnWorkGroup.Builder.() -> Unit = {}): CfnWorkGroup = CfnWorkGroup.Builder.create(this, id).apply(initializer).build()
