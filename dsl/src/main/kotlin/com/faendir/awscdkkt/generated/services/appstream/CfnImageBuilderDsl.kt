package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnImageBuilder
import software.amazon.awscdk.services.appstream.CfnImageBuilderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImageBuilder(id: String, props: CfnImageBuilderProps): CfnImageBuilder =
    CfnImageBuilder(this, id, props)

@Generated
public fun Construct.cfnImageBuilder(
  id: String,
  props: CfnImageBuilderProps,
  initializer: @AwsCdkDsl CfnImageBuilder.() -> Unit,
): CfnImageBuilder = CfnImageBuilder(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnImageBuilder(id: String, initializer: @AwsCdkDsl
    CfnImageBuilder.Builder.() -> Unit): CfnImageBuilder = CfnImageBuilder.Builder.create(this,
    id).apply(initializer).build()
