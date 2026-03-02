package com.faendir.awscdkkt.generated.services.devopsagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsagent.CfnService
import software.amazon.awscdk.services.devopsagent.CfnServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: @AwsCdkDsl CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnService(id: String, initializer: @AwsCdkDsl CfnService.Builder.() -> Unit = {}): CfnService = CfnService.Builder.create(this, id).apply(initializer).build()
