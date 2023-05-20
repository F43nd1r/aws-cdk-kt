@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import software.constructs.Construct

public fun Construct.cfnDocument(
  id: String,
  props: CfnDocumentProps,
  initializer: CfnDocument.() -> Unit = {},
): CfnDocument = CfnDocument(this, id, props).apply(initializer)
