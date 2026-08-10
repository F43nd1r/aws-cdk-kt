package com.faendir.awscdkkt.generated.services.transcribe

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transcribe.CfnMedicalTranscriptionJob
import software.amazon.awscdk.services.transcribe.CfnMedicalTranscriptionJobProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMedicalTranscriptionJob(
  id: String,
  props: CfnMedicalTranscriptionJobProps,
  initializer: @AwsCdkDsl CfnMedicalTranscriptionJob.() -> Unit = {},
): CfnMedicalTranscriptionJob = CfnMedicalTranscriptionJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMedicalTranscriptionJob(id: String, initializer: @AwsCdkDsl CfnMedicalTranscriptionJob.Builder.() -> Unit = {}): CfnMedicalTranscriptionJob = CfnMedicalTranscriptionJob.Builder.create(this, id).apply(initializer).build()
