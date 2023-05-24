package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import software.amazon.awscdk.services.sagemaker.CfnModelPackageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelPackage(id: String, props: CfnModelPackageProps): CfnModelPackage =
    CfnModelPackage(this, id, props)

@Generated
public fun Construct.cfnModelPackage(
  id: String,
  props: CfnModelPackageProps,
  initializer: @AwsCdkDsl CfnModelPackage.() -> Unit,
): CfnModelPackage = CfnModelPackage(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnModelPackage(id: String): CfnModelPackage = CfnModelPackage(this, id)

@Generated
public fun Construct.cfnModelPackage(id: String, initializer: @AwsCdkDsl
    CfnModelPackage.() -> Unit): CfnModelPackage = CfnModelPackage(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnModelPackage(id: String, initializer: @AwsCdkDsl
    CfnModelPackage.Builder.() -> Unit): CfnModelPackage = CfnModelPackage.Builder.create(this,
    id).apply(initializer).build()
