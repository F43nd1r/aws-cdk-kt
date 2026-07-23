package com.faendir.awscdkkt.generated.services.certificatemanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnAcmeDomainValidation
import software.amazon.awscdk.services.certificatemanager.CfnAcmeDomainValidationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAcmeDomainValidation(
  id: String,
  props: CfnAcmeDomainValidationProps,
  initializer: @AwsCdkDsl CfnAcmeDomainValidation.() -> Unit = {},
): CfnAcmeDomainValidation = CfnAcmeDomainValidation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAcmeDomainValidation(id: String, initializer: @AwsCdkDsl CfnAcmeDomainValidation.Builder.() -> Unit = {}): CfnAcmeDomainValidation = CfnAcmeDomainValidation.Builder.create(this, id).apply(initializer).build()
