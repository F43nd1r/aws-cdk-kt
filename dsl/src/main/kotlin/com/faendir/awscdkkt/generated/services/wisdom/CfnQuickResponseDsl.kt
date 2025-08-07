package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnQuickResponse
import software.amazon.awscdk.services.wisdom.CfnQuickResponseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQuickResponse(
  id: String,
  props: CfnQuickResponseProps,
  initializer: @AwsCdkDsl CfnQuickResponse.() -> Unit = {},
): CfnQuickResponse = CfnQuickResponse(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQuickResponse(id: String, initializer: @AwsCdkDsl CfnQuickResponse.Builder.() -> Unit = {}): CfnQuickResponse = CfnQuickResponse.Builder.create(this, id).apply(initializer).build()
