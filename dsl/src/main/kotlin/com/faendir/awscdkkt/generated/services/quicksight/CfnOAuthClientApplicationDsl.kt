package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnOAuthClientApplication
import software.amazon.awscdk.services.quicksight.CfnOAuthClientApplicationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOAuthClientApplication(
  id: String,
  props: CfnOAuthClientApplicationProps,
  initializer: @AwsCdkDsl CfnOAuthClientApplication.() -> Unit = {},
): CfnOAuthClientApplication = CfnOAuthClientApplication(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOAuthClientApplication(id: String, initializer: @AwsCdkDsl CfnOAuthClientApplication.Builder.() -> Unit = {}): CfnOAuthClientApplication = CfnOAuthClientApplication.Builder.create(this, id).apply(initializer).build()
