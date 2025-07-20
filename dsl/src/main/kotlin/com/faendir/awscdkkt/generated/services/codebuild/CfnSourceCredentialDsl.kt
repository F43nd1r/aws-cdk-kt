package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSourceCredential(
  id: String,
  props: CfnSourceCredentialProps,
  initializer: @AwsCdkDsl CfnSourceCredential.() -> Unit = {},
): CfnSourceCredential = CfnSourceCredential(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSourceCredential(id: String, initializer: @AwsCdkDsl CfnSourceCredential.Builder.() -> Unit = {}): CfnSourceCredential = CfnSourceCredential.Builder.create(this, id).apply(initializer).build()
