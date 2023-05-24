package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.amazon.awscdk.services.transfer.CfnAgreementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgreement(id: String, props: CfnAgreementProps): CfnAgreement =
    CfnAgreement(this, id, props)

@Generated
public fun Construct.cfnAgreement(
  id: String,
  props: CfnAgreementProps,
  initializer: @AwsCdkDsl CfnAgreement.() -> Unit,
): CfnAgreement = CfnAgreement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAgreement(id: String, initializer: @AwsCdkDsl
    CfnAgreement.Builder.() -> Unit): CfnAgreement = CfnAgreement.Builder.create(this,
    id).apply(initializer).build()
