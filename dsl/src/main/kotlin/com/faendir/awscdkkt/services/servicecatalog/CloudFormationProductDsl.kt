@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
