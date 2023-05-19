@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
import software.constructs.Construct

public fun Construct.cloudFormationProduct(
  id: String,
  props: CloudFormationProductProps,
  initializer: CloudFormationProduct.() -> Unit = {},
): CloudFormationProduct = CloudFormationProduct(this, id, props).apply(initializer)
