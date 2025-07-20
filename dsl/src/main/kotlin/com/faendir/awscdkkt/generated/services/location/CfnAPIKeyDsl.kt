package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnAPIKey
import software.amazon.awscdk.services.location.CfnAPIKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAPIKey(
  id: String,
  props: CfnAPIKeyProps,
  initializer: @AwsCdkDsl CfnAPIKey.() -> Unit = {},
): CfnAPIKey = CfnAPIKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAPIKey(id: String, initializer: @AwsCdkDsl CfnAPIKey.Builder.() -> Unit = {}): CfnAPIKey = CfnAPIKey.Builder.create(this, id).apply(initializer).build()
