package com.faendir.awscdkkt.services.transfer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnAgreement
import software.amazon.awscdk.services.transfer.CfnAgreementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAgreement(
  id: String,
  props: CfnAgreementProps,
  initializer: CfnAgreement.() -> Unit = {},
): CfnAgreement = CfnAgreement(this, id, props).apply(initializer)
