package com.faendir.awscdkkt.services.codebuild

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
  initializer: CfnSourceCredential.() -> Unit = {},
): CfnSourceCredential = CfnSourceCredential(this, id, props).apply(initializer)
