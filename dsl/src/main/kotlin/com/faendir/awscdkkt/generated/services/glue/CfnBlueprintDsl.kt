package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnBlueprint
import software.amazon.awscdk.services.glue.CfnBlueprintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBlueprint(
  id: String,
  props: CfnBlueprintProps,
  initializer: @AwsCdkDsl CfnBlueprint.() -> Unit = {},
): CfnBlueprint = CfnBlueprint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBlueprint(id: String, initializer: @AwsCdkDsl CfnBlueprint.Builder.() -> Unit = {}): CfnBlueprint = CfnBlueprint.Builder.create(this, id).apply(initializer).build()
