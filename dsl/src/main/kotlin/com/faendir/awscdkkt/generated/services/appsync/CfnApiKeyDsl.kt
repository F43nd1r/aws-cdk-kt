package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApiKey
import software.amazon.awscdk.services.appsync.CfnApiKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiKey(
  id: String,
  props: CfnApiKeyProps,
  initializer: @AwsCdkDsl CfnApiKey.() -> Unit = {},
): CfnApiKey = CfnApiKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiKey(id: String, initializer: @AwsCdkDsl CfnApiKey.Builder.() -> Unit = {}): CfnApiKey = CfnApiKey.Builder.create(this, id).apply(initializer).build()
