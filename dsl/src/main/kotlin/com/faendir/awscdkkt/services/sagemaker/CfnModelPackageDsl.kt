package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelPackage(id: String, initializer: CfnModelPackage.() -> Unit = {}):
    CfnModelPackage = CfnModelPackage(this, id).apply(initializer)

@Generated
public fun Construct.cfnModelPackage(
  id: String,
  props: CfnModelPackageProps,
  initializer: CfnModelPackage.() -> Unit = {},
): CfnModelPackage = CfnModelPackage(this, id, props).apply(initializer)
