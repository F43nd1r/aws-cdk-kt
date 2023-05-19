@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.constructs.Construct

public fun Construct.cfnSourceCredential(
  id: String,
  props: CfnSourceCredentialProps,
  initializer: CfnSourceCredential.() -> Unit = {},
): CfnSourceCredential = CfnSourceCredential(this, id, props).apply(initializer)
