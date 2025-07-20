package com.faendir.awscdkkt.generated.services.refactorspaces

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: @AwsCdkDsl CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnService(id: String, initializer: @AwsCdkDsl CfnService.Builder.() -> Unit = {}): CfnService = CfnService.Builder.create(this, id).apply(initializer).build()
