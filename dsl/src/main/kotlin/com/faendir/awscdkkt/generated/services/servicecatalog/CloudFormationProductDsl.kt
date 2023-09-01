package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFormationProduct(
  id: String,
  props: CloudFormationProductProps,
  initializer: @AwsCdkDsl CloudFormationProduct.() -> Unit = {},
): CloudFormationProduct = CloudFormationProduct(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCloudFormationProduct(id: String, initializer: @AwsCdkDsl
    CloudFormationProduct.Builder.() -> Unit = {}): CloudFormationProduct =
    CloudFormationProduct.Builder.create(this, id).apply(initializer).build()
