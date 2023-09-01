package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnTag
import software.amazon.awscdk.services.lakeformation.CfnTagProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTag(
  id: String,
  props: CfnTagProps,
  initializer: @AwsCdkDsl CfnTag.() -> Unit = {},
): CfnTag = CfnTag(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTag(id: String, initializer: @AwsCdkDsl CfnTag.Builder.() -> Unit =
    {}): CfnTag = CfnTag.Builder.create(this, id).apply(initializer).build()
