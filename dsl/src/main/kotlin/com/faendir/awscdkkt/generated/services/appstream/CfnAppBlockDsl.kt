package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnAppBlock
import software.amazon.awscdk.services.appstream.CfnAppBlockProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAppBlock(id: String, props: CfnAppBlockProps): CfnAppBlock =
    CfnAppBlock(this, id, props)

@Generated
public fun Construct.cfnAppBlock(
  id: String,
  props: CfnAppBlockProps,
  initializer: @AwsCdkDsl CfnAppBlock.() -> Unit,
): CfnAppBlock = CfnAppBlock(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAppBlock(id: String, initializer: @AwsCdkDsl
    CfnAppBlock.Builder.() -> Unit): CfnAppBlock = CfnAppBlock.Builder.create(this,
    id).apply(initializer).build()
